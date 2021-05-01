package com.misolab.front.domain.dao;


import com.misolab.front.domain.entity.Member;
import com.misolab.front.domain.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class MemberDao {

    final SqlSession sqlSession;
    final MemberMapper memberMapper;

    public String getDate() {
        String result = memberMapper.getDate();
        return result;
    }

    public List<Member> allMembers() {
        List<Member> result = sqlSession.selectList("allMembers");
        return result;
    }


}
