package org.zerock.ex2.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.zerock.ex2.entity.Memo;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {

    @Query(value = " select * from tbl_memo where mno > 0 " ,
            nativeQuery = true)
    List<Object[]> getNativeResult();

    
    @Transactional
    @Modifying
    @Query("update Memo m " +
            "set m.memoText = :memoText " +
            "where m.mno = :mno")
    int updateMemoText(@Param("mno") Long mno, @Param("memoText") String memoText);
    @Query("select m from Memo m " +
            "where m.mno = :mno " +
            "order by m.mno desc")
    List<Memo> getListDesc(@Param("mno") Long mno);



    //    Between
//    findByStartDateBetween
//    … where x.startDate between ?1 and ?2

    List<Memo> findByMnoBetweenOrderByMnoDesc(Long from, Long to);
    Page<Memo> findByMnoBetween(Long from, Long to, Pageable pageable);
}


