package com.linhtb2008110307.tieuluancuoiky;



public class HangHoaTestDrive {
    
    

    public static void main(String[] args) {
        
        HangHoaLinkList testDriveList = new HangHoaLinkList();
        //thuc pham
        testDriveList.add("thuc pham", 1001, "thit      ", 100000, 100, "10/12/2021");
        testDriveList.add("thuc pham", 1002, "trung     ", 20000, 1000, "15/12/2021");
        testDriveList.add("thuc pham", 1003, "ca        ", 80000, 50, "13/12/2021");
        testDriveList.add("thuc pham", 1004, "gao       ", 10000, 500, "20/12/2021");
        testDriveList.add("thuc pham", 1005, "rau       ", 30000, 100, "25/12/2021");
        //sanh su
        testDriveList.add("sanh su", 2001, "chen      ", 10000, 1000, "10/5/2021");
        testDriveList.add("sanh su", 2002, "ly        ", 5000, 2000, "17/5/2021");
        testDriveList.add("sanh su", 2003, "binh hoa  ", 50000, 200, "20/5/2021");
        testDriveList.add("sanh su", 2004, "binh tra  ", 10000, 500, "25/5/2021");
        testDriveList.add("sanh su", 2005, "lu        ", 20000, 100, "1/6/2021");
        //dien may
        testDriveList.add("dien may", 3001, "tivi      ", 3000000, 100, "10/2/2021");
        testDriveList.add("dien may", 3002, "tu lanh   ", 5000000, 300, "12/2/2021");
        testDriveList.add("dien may", 3003, "may giat  ", 2000000, 500, "14/2/2021");
        testDriveList.add("dien may", 3004, "dien thoai", 3500000, 200, "20/2/2021");
        testDriveList.add("dien may", 3005, "laptop    ", 8000000, 50, "22/2/2021");

        
        testDriveList.menu();
    }
}
