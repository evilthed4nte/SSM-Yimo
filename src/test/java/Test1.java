import com.yimo.mapper.GirlMapper;
import com.yimo.pojo.Girl;
import com.yimo.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Test1 {
    @Test
    public void m1(){
        SqlSession sqlSession = MybatisUtil.getSession();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);
        Girl g = mapper.queryById(10);
        System.out.println(g);
        sqlSession.commit();
        sqlSession.close();
    }
}
