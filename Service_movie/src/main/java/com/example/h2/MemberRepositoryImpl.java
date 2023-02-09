//package com.example.h2;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
//import org.springframework.stereotype.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//@Repository
//public class MemberRepositoryImpl implements MemberRepository {
//    private final JdbcTemplate jdbcTemplate;
//
//    //   이렇게 그냥 생성해도 되긴 된다.
////    public MemberRepositoryImpl(DataSource dataSource) {
////        jdbcTemplate = new JdbcTemplate(dataSource);
////    }
//    // DI 로 수정
//    @Autowired
//    public MemberRepositoryImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public Member save(Member member) {
//        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
//        jdbcInsert.withTableName("member").usingGeneratedKeyColumns("email");
//
//        Map<String, Object> parameters = new HashMap<>();
//        parameters.put("email", member.getEmail());
//
//        Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
//        member.setEmail(key.toString());
//
//        return member;
//    }
//
//    @Override
//    public List<Member> findAll() {
//        return jdbcTemplate.query("select * from member", memberRowMapper());
//    }
//
//    @Override
//    public Optional<Member> findByName(String name) {
//        List<Member> result = jdbcTemplate.query("select * from member where email = ?", memberRowMapper(), name);
//        return result.stream().findAny();
//    }
//
//    private RowMapper<Member> memberRowMapper() {
//        return new RowMapper<Member>() {
//            @Override
//            public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Member member = new Member();
//                member.setEmail(rs.getString("email"));
//                member.setPassword(rs.getString("password"));
//                return member;
//            }
//        };
//    }
//
//}
