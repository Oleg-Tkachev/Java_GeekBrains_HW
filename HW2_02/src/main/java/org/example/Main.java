package org.example;

public class Main {
    public static void main(String[] args) {

            //  Сформируйте часть WHERE этого запроса, используя StringBuilder.
            //  Данные для фильтрации приведены ниже в виде json строки.
            //  Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

            String str = "{\"name\":\"Ivanov\", \"country\":\"Moscow\", \"city\":\"Moscow\", \"age\":\"null\"}";
            String[] strList = str.replaceAll("[{}\" ]", "").split(",");
            System.out.println(str);
            StringBuilder sb = new StringBuilder("select * from students where ");
            int length = sb.length();
            int index;
            for (String s : strList) {
                index = s.indexOf(":");
                if (s.substring(index + 1).equals("null")) continue;
                if (length != sb.length()) sb.append(" and ");
                sb.append(s, 0, index)
                        .append(" = ")
                        .append("'")
                        .append(s.substring(index + 1))
                        .append("'");
            }
            System.out.println(sb);
        }

    }
