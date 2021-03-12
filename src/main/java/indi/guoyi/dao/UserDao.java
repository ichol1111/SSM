package indi.guoyi.dao;

import indi.guoyi.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository(value = "ud")
public interface UserDao {
    @Insert("insert into user (name,account,password) values (#{name},#{account},#{password})")
    void insert(User user);

    @Delete("delete from user where id = #{id}")
    void delete(Integer id);

    @Select("select * from user")
    List<User> findAll();

    @Update("update user set name=#{name},account=#{account},password=#{password} where id = #{id}")
    void update(User user);
}
