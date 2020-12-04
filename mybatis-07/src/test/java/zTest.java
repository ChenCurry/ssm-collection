import com.hello.dao.TeacherMapper;
import com.hello.pojo.Teacher;
import com.hello.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class zTest {
    @Test
    public void test() {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        for (Teacher teacher : sqlSession.getMapper(TeacherMapper.class).getTeacher()) {
//            System.out.println(teacher);
//        }
//        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void test3() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
