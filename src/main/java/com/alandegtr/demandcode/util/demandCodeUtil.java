package com.alandegtr.demandcode.util;

public class demandCodeUtil {
    public static String randomDemandCode() {
        StringBuilder demandCode = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            char temp = 0;
            int key = (int) (Math.random() * 2);
            switch (key) {
                case 0:
                    temp = (char) (Math.random() * 10 + 48);//产生随机数字
                    break;
                case 1:
                    temp = (char) (Math.random() * 6 + 'A');//产生a-f
                    break;
                default:
                    break;
            }
            demandCode.append(temp);
        }
        return demandCode.toString();
    }
}
