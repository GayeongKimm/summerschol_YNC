package org.zerock.ex2.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity //해당클래스가 엔티티클래스 임을 표시.
@Table(name = "tbl_memo")//이름을 지정할 때
@AllArgsConstructor
@NoArgsConstructor (access = AccessLevel.PROTECTED)
@Builder
public class Memo {
    @Id //PK관련설정 자동으로 생성되는 방식은 @Genera--
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;
    @Column(length = 200, nullable = false)
    private String memoText;




}
