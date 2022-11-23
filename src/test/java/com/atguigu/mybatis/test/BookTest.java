package com.atguigu.mybatis.test;

import com.atguigu.mapperTest.CartMapper;
import com.atguigu.mapperTest.UserMapper;
import com.atguigu.pojoTest.BookUser;
import com.atguigu.pojoTest.Cart;
import com.atguigu.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookTest {


    @Test
    public void testGetBookByStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CartMapper mapper = sqlSession.getMapper(CartMapper.class);
        BookUser bookUser = new BookUser(3, "小明");
        List<Cart> allCart = mapper.getAllCart(bookUser);
        allCart.forEach(System.out::println);


    }

    @Test
    public void testGetBookUserAndCart() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        BookUser bookUserAndCart = mapper.getBookUserAndCart(3);
        List<Cart> carts = bookUserAndCart.getCarts();
        System.out.println(bookUserAndCart);
        for (Cart cartItem : carts) {
            String res = String.valueOf(cartItem);
            Integer id = cartItem.getId();
            if (res.contains("id=" + id)) {
                System.out.println("cartItem中包含id" + id);
            } else {
                System.out.println("cartItem不包含id34" + id);
            }
        }
    }

    @Test
    public void testGetBookUserAndCartByMap() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> bookUserAndCartByMap = mapper.getBookUserAndCartByMap(3);
        System.out.println(bookUserAndCartByMap);
        Set<Map.Entry<String, Object>> entries = bookUserAndCartByMap.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            BookUser bookUser = (BookUser) entry.getValue();

            BookUser bookUser1=new BookUser();
            bookUser1.setId(bookUser.getId());
            bookUser1.setCarts(bookUser.getCarts());
            bookUser1.setUname(bookUser.getUname());

            System.out.println(bookUser);

            Map<String, Object> tempMap = new HashMap<>();
            // 获取实体类的所有属性，返回Field数组
            Field[] fields = bookUser1.getClass().getDeclaredFields();

            System.out.println("fields长度为"+fields.length);
            // 遍历所有属性
            for (int j = 0; j < fields.length; j++) {
                // 获取属性的名字
                String name = fields[j].getName();
                // 将属性的首字符大写，方便构造get，set方法
                name = name.substring(0, 1).toUpperCase() + name.substring(1);
                //打印属性名
                System.out.println("BookUser类中属性名为" + name);
                // 如果type是类类型，则前面包含"class "，后面跟类名
                //getGenericType.toString方法为获取类型名
                String type = fields[j].getGenericType().toString();

                System.out.println("属性为" + type);

                //getDeclaredMethods为获取一个类中所有的方法
                //etDeclaredMethods:获取声明方法
                Method[] methods = BookUser.class.getDeclaredMethods();

                //遍历类中的方法
                for (Method method : methods) {
                    //如果方法为get方法,则调用此方法,返回属性值
                    //前提是必须是实例化后的类
                    if (method.getName().equals("get" + name)) {
                        Object invoke = method.invoke(bookUser1);
                        System.out.println(invoke);
                    }

                }


            }

            System.out.println(tempMap);
        }


    }
}
