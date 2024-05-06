package com.ruveyda.utility;

import com.ruveyda.entity.enums.EBrand;

import java.util.List;
import java.util.Random;
import java.util.*;

public class ChassisCodeGenerator {

//    public static void main(String[] args) {
//        String generateCode = generateCode();
//        String generateBatchNumber = generateBatchNumber();
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(generateBatchNumber);
//        stringBuilder.append(generateCode);
//
//        System.out.println(generateCode().toString());
//        System.out.println(generateBatchNumber());
//        System.out.println(String.join(generateBatchNumber,"",generateCode));
//    }
//    public static void main(String[] args) {
//        String batchNo = generateBatchNumber();
//        String brand  = EBrand.ASTON_MARTIN.toString();
//        System.out.println(brand.indexOf("-"));
//        String initials = String.join("",String.valueOf(brand.charAt(0)),String.valueOf())
////       String batchNo = generateBatchNumber();
//       for (int i=0; i < 17 ; i++){
//           System.out.println(generateChassisCode(batchNo, EBrand.ASTON_MARTIN.toString(),"Vantage"));
//       }
//    }

    public static String generateCarCode(String batchNumber, EBrand brand, String model) {
        String initials = brand.getInitials();
        String modelInitials = model.toUpperCase().substring(0, 2);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(initials + "-" + modelInitials+"-");
        stringBuilder.append(batchNumber);
        stringBuilder.append("-");
        stringBuilder.append(generateCode());

        return stringBuilder.toString();
    }

    public static String generateCode() {
        UUID uuid = UUID.randomUUID();
        // UUID'yi al ve '-' karakterlerini kaldır
        String uniqueCode = uuid.toString().replaceAll("-", "");
        // 50 karakterlik bir kısmını al, daha fazla karakter varsa kırp
        return uniqueCode.substring(0, 20).toUpperCase();
    }

    public static String generateBatchNumber() {
        UUID uuid = UUID.randomUUID();
        String uniqueCode = uuid.toString().replaceAll("-", "").toUpperCase();

        char[] charArr = new char[2];
        int charIndex = 0;
        for (int i = 0; i < uniqueCode.length(); i++) {
            int asciiValue = uniqueCode.charAt(i);
            if (asciiValue >= 65 && asciiValue <= 90) {
                charArr[charIndex] = (char) asciiValue;
                charIndex++;
            }
            if (charIndex == 2) {
                break;
            }
        }
        return String.valueOf(charArr);
    }

    }


