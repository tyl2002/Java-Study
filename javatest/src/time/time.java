package src.time;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class time {
    public static void main(String[] args){
//        int n = 1234000;
//        Date date = new Date();
//        var sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.format(date));//格式化输出  2024-09-15 10:29:53
//        var sdf1 =new SimpleDateFormat("E MMM dd, yyyy");
//        System.out.println(sdf1.format(date));//格式化输出  周日 9月 15, 2024
//        System.out.println(System.currentTimeMillis());
//        System.out.println(date.getYear()+1900);
//        System.out.println(date.getMonth()+1);
//        System.out.println(date.getDate());
//        System.out.println(date.toString());
//        System.out.println(date.toGMTString());
//        System.out.println(date.toLocaleString());//转化为本地时间
//        Calendar c = Calendar.getInstance();
//        int y = c.get(Calendar.YEAR);
//        int m = 1+c.get(Calendar.MONTH);
//        int d = c.get(Calendar.DAY_OF_MONTH);
//        int w = c.get(Calendar.DAY_OF_WEEK);
//        int hh = c.get(Calendar.HOUR_OF_DAY);
//        int mm = c.get(Calendar.MINUTE);
//        int ss = c.get(Calendar.SECOND);
//        int ms = c.get(Calendar.MILLISECOND);
//        System.out.println(y+"-"+m+"-"+d+" "+w+" "+hh+":"+mm+":"+ss+"."+ms);
//        c.clear();
//        c.set(Calendar.YEAR,2024);
//        c.set(Calendar.MONTH,8);
//        c.set(Calendar.DATE,15);
//        c.set(Calendar.HOUR_OF_DAY,10);
//        c.set(Calendar.MINUTE,29);
//        c.set(Calendar.SECOND,53);
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));//2024-09-15 10:29:53


//        TimeZone tzDefault = TimeZone.getDefault();
//        TimeZone tzGMT9 = TimeZone.getTimeZone("GMT+09:00");
//        TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
//        System.out.println(tzDefault.getID());//Asia/Shanghai
//        System.out.println(tzGMT9.getID());//GMT+09:00
//        System.out.println(tzNY.getID());//America/New_York
//        System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));//列出所有可用ID
//        Calendar c = Calendar.getInstance();
//        c.clear();
//        c.setTimeZone(TimeZone.getTimeZone("GMT+09:00"));
//        c.set(2024,10,20,12,25);
//        var sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.format(c.getTime()));//2024-11-20 11:25:00
//        System.out.println(c.getTime());//2024-11-20 11:25:00
//        LocalDateTime  lt = LocalDateTime.now();
//        System.out.println(lt);//2024-09-15T15:17:09.545305500
//
//        LocalDate d = lt.toLocalDate();//转换为当地时间
//        LocalTime t = lt.toLocalTime();
//        System.out.println(d);
//        System.out.println(t);
//        //指定日期和时间创建
//        LocalDate d2 = LocalDate.of(2023,11,26);
//        LocalTime t2 = LocalTime.of(15,16,34);
//        LocalDateTime dt2 = LocalDateTime.of(d2,t2);
        LocalDateTime dt3 = LocalDateTime.of(2023,11,12,15,25,30);

//        System.out.println("d2 "+d2);//d2 2023-11-26
//        System.out.println("t2 "+t2);//t2 15:16:34
//        System.out.println("dt2 "+dt2);//dt2 2023-11-26T15:16:34
        System.out.println("dt3 "+dt3);//dt3 2023-11-12T15:25:30
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        System.out.println(dtf.format(LocalDateTime.now()));
//
//        //自定义格式解析
//        LocalDateTime dt2 = LocalDateTime.parse("2019/11/30 16:14:12",dtf);
//        System.out.println(dt2);
//        LocalDateTime dt2 = dt3.plusDays(5).minusHours(3).minusMonths(12);//加五天减三小时减12个月
//        System.out.println(dt2);//dt3 2023-11-12T15:25:30   2022-11-17T12:25:30
//
//        LocalDateTime dt4 = dt3.withYear(2024).withMonth(9).withDayOfMonth(15).withHour(16).withMinute(22).withSecond(22);
//        System.out.println(dt4);//2024-09-15T16:22:22

        LocalDateTime firstDay = LocalDate.now().withDayOfMonth(1).atStartOfDay();//本月第一天
//        System.out.println(firstDay);
        //本月最后一天
        LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
//        System.out.println(lastDay);

        LocalDate nextMonthFirstDay = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());//下月第一天
//        System.out.println(nextMonthFirstDay);

        LocalDate firstWeekday = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));//本月第一个星期一
//        System.out.println(firstWeekday);

//        Duration d = Duration.between(dt3,firstDay);
//        System.out.println(d);//PT7040H34M30S
//
//        Period p = LocalDate.of(2019,11,19).until(lastDay);
//        System.out.println(p);//P4Y10M11D

//        ZonedDateTime zdt = ZonedDateTime.now();
//        System.out.println("zdt:"+zdt);//zdt:2024-09-19T17:36:39.555947+08:00[Asia/Shanghai]
//        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));
//        System.out.println("zny:"+zny);//zny:2024-09-19T05:36:39.556944-04:00[America/New_York]

//        ZonedDateTime zbj = dt3.atZone(ZoneId.systemDefault());
//        ZonedDateTime zny = dt3.atZone(ZoneId.of("America/New_York"));
//        System.out.println(zbj);//2023-11-12T15:25:30+08:00[Asia/Shanghai]
//        System.out.println(zny);//2023-11-12T15:25:30-05:00[America/New_York]

//        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.systemDefault());
//        ZonedDateTime zdt2 = zdt.withZoneSameInstant(ZoneId.of("America/New_York"));
//        System.out.println(zdt);//2024-09-19T17:46:12.057171500+08:00[Asia/Shanghai]
//        System.out.println(zdt2);//2024-09-19T05:46:12.057171500-04:00[America/New_York]

//        LocalDateTime ldt = LocalDateTime.now();
//        LocalDateTime arr = ldt.plusHours(13).plusMinutes(20);
//        ZonedDateTime zdt1 = arr.atZone(ZoneId.systemDefault());
//        System.out.println(zdt1);
//        ZonedDateTime zdt = zdt1.withZoneSameInstant(ZoneId.of("America/New_York"));
//        System.out.println(zdt);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        Instant ins1 = new Date().toInstant();
        Calendar cal = Calendar.getInstance();
        Instant ins2 = cal.toInstant();
        ZonedDateTime zdt = ins2.atZone(cal.getTimeZone().toZoneId());

        System.out.println(zdt);









    }
}
