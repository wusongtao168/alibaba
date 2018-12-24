package cn.flash.express.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

/**
 * @author:Wusongtao
 * @Date:2018/12/22下午5:00
 */
public class DateUtils {
        public static Date yesterday() {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, -1);
            Date time = cal.getTime();
            return time;
        }

        /**
         * 获取某个月的最大天数
         * @param date
         * @return
         */
        public static int getMaxMonthDay(Date date) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.getActualMaximum(Calendar.DATE);
        }

        /**
         * 获取某个月中第几天
         * @param date
         * @return
         */
        public static int dayOfMonth(Date date) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.get(Calendar.DAY_OF_MONTH);
        }

        /**
         * 得到几天前的时间
         * @param date
         * @param day
         * @return
         */
        public static Date getDateBefore(Date date,int day){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(calendar.DATE,calendar.get(calendar.DATE)-day);
            return calendar.getTime();
        }

        /**
         * 得到几天后的时间
         * @param date
         * @param day
         * @return
         */
        public static Date getDateAfter(Date date,int day){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(calendar.DATE,calendar.get(calendar.DATE)+day);
            return calendar.getTime();
        }

        /**
         * 获取下一个小时
         * @param date
         * @return
         */
        public static Date getNextHour(Date date) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) + 1);
            return calendar.getTime();
        }

        /**
         * 获取月份
         * @param date
         * @return
         */
        public static int month(Date date) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.get(Calendar.MONTH);
        }

        /**
         * 获取年月部分
         * @param date
         * @return
         */
        public static String getYearsMonth(Date date) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Integer year = calendar.get(Calendar.YEAR);
            Integer month = calendar.get(Calendar.MONTH) + 1;
            String result = null;
            if (month > 9) {
                result = year + "" +  month;
            } else {
                result = year + "0" + month;
            }
            return result;
        }

        public static LocalTime UDateToLocalTime(Date date) {
            Instant instant = date.toInstant();
            ZoneId zone = ZoneId.systemDefault();
            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
            LocalTime localTime = localDateTime.toLocalTime();
            return localTime;
        }

        public static LocalDate UDateToLocalDate(Date date) {
            Instant instant = date.toInstant();
            ZoneId zone = ZoneId.systemDefault();
            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
            LocalDate localDate = localDateTime.toLocalDate();
            return localDate;
        }

        /**
         * 计算两个日期之间相差的天数
         * @param date1
         * @param date2
         * @return
         */
        public static int daysBetween(Date date1,Date date2)
        {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date1);
            long time1 = cal.getTimeInMillis();
            cal.setTime(date2);
            long time2 = cal.getTimeInMillis();
            long between_days=(time2-time1)/(1000*3600*24);
            return Integer.parseInt(String.valueOf(between_days));
        }

        /**
         * 将yyyy-MM-dd HH:mm:ss 转换为 yyyy-MM-dd
         * @return
         */
        public static Date getDateShort(Date date) throws ParseException {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = formatter.format(date);
            ParsePosition pos = new ParsePosition(8);
            Date parse = formatter.parse(dateString);
            return parse;
        }
    }



