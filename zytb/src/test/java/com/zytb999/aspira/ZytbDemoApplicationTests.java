//
//
//package com.zytb999.aspira;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.github.pagehelper.PageHelper;
//import com.zytb999.aspira.domian.*;
//import com.zytb999.aspira.mapper.*;
//import com.zytb999.aspira.util.YearUtil;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.text.ParseException;
//import java.util.Arrays;
//import java.util.List;
//
//
////@SpringBootTest
//class ZytbDemoApplicationTests {
////    @Autowired
////    private IUserMapper userMapper;
////    @Autowired
////    private IUserService userService;
////    @Autowired
////    private IMajorMapper majorMapper;
////    @Autowired
////    private ISchoolRankMapper schoolRankMapper;
////    @Autowired
////    private IUserAccountMapper userAccountMapper;
////    @Autowired
////    private ICollegeMapper collegeMapper;
////    @Autowired
////    private IUserFeedbackMapper userFeedbackMapper;
////    @Autowired
////    private ICEEData_college_jiangsuMapper college_jiangsuMapper;
////    @Autowired
////    private IUserFeedbackService feedbackService;
//    @Test
//    void contextLoads() {
//    }
//    @Test
//    public void testInsert() {
//        User User = new User();
//        User.setPhone("18845246352");
//        userMapper.insert(User);
//        //mybatisplus会自动把当前插入对象在数据库中的id写回到该实体中
//        System.out.println(User.getId());
//    }
//    @Test
//    public void test() {
//        PageHelper.startPage(0, 5, "id desc");
//        List<User> list = userService.list(new QueryWrapper<>());
//        System.out.println(list);
//    }
//    @Test
//    public void test2() {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select("id", "phone");
//        List<User> users = userMapper.selectList(queryWrapper);
//        users.forEach(System.out::println);
//    }
//    @Test
//    public void test3() {
//        String s = userMapper.selectProvince("1");
//        if (s.equals("1")){
//            System.out.println("kp");
//        }
//        System.out.println(s);
//    }
//  /*  @Test
//    public void test4() {
//        List<Major> majors = majorMapper.sleectMajor();
//        majors.forEach(System.out::println);
//        System.out.println(majors);
//    }*/
//    @Test
//    public void test5() {
//        SchoolRank s = schoolRankMapper.selectById("QSschoolRank2020");
//        System.out.println(s);
//    }
//    @Test
//    public void test6() throws ParseException {
//      userAccountMapper.updateLastTime("13776416562",YearUtil.getNowDate());
//    }
//    @Test
//    public void test7() throws ParseException {
//        String s = userMapper.selectNums();
//        System.out.println(s);
//    }
//   /* @Test
//    public void test9()  {
//        List<College> introMsg = collegeMapper.getIntroMsg("培黎职业学院");
//        System.out.println(introMsg);
//    }*/
//  /*  @Test
//    public void test10()  {
//        String[] i={"dad","dad"};
//        feedbackService.updateFeedback(i,"dd","das","446546666");
//    }*/
//
//
//
//    public static void main(String[] args) {
//        String a = "['文学-外国语言文学类', '本科', '四年']";
//        String regExp = "[\n`~!@#$%^&*()+=|{}':;'\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？]";
//        String replace = "";
//        a = a.replaceAll(regExp, replace);
//        System.out.println("去除特殊字符后的值：" + a);
//        String[] split = a.split(",");
//        System.out.print(Arrays.toString(split));
//    }
//
//
//
//    @Test
//    void test11(){
//        List<College> list = college_jiangsuMapper.selectRecommendCollegeHN1("本科第一批", 3, 3, 0, 0, 0, 3, 3, 650.0, 2020);
//        System.out.println(list.size());
//    }
//
//}
//
