
package hruler.hrulerspring;
import hruler.hrulerspring.aop.TimeTraceAop;
import hruler.hrulerspring.repository.*;
import hruler.hrulerspring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
@Configuration
public class SpringConfig {
    //    private final DataSource dataSource;
//    private EntityManager em;
    private final MemberRepository memberRepository;

    @Autowired // 생성자가 하나인 경우 생략 가능
    public SpringConfig(MemberRepository memberRepository) {
//        this.dataSource = dataSource;
//        this.em = em;
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
//        return new MemberService(memberRepository());
        return new MemberService(memberRepository);
    }

//    @Bean
//    public TimeTraceAop timeTraceAop() {
//        return new TimeTraceAop();
//    }

//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }
}