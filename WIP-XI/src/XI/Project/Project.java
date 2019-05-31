/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

/**
 *
 * @author wipcamp11
 */
import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        int item = 2;
        int limit = 10;
        System.out.println("โกดังสินค้าเถื่อน");
        System.out.println("เลือกรายการที่จะทำดิ");
        System.out.println("1 เพิ่มสินค้าเถื่อน");
        System.out.println("2 ทำลายหลักฐาน");
        System.out.println("3 เช็คของเถื่อน");
        System.out.println("เลือกเลข : ");
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();

        if (menu == 1) {

            if (item < limit) {

                System.out.println("เพิ่มสินค้าจำนวน  : ");
                int amount = input.nextInt();
                if (item + amount > limit) {
                    System.out.println("เกินจำนวนที่จะเก็บได้");

                } else {
                    item = item + amount;
                    System.out.println("ตอนนี้สินค้ามี : " + item);
                }
            } else {
                System.out.println("เต็มแล้วจ้า");
            }

        }
        if (menu == 2) {

            if (item >= 0) {

                System.out.println("ลดสินค้าจำนวน  : ");
                int amount = input.nextInt();
                if (item - amount < 0) {
                    System.out.println("เกินจำนวนที่จะลดได้");

                } else {
                    item = item - amount;
                    System.out.println("ตอนนี้สินค้ามี " + item);

                }
            }
        }
        if (menu == 3) {
            System.out.println("ในโกดังมีสินค้า : " + item);
        }
        if (menu > 3) {
            System.out.println("ไม่มีในตัวเลือก");
        }
    }
}
