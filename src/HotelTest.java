
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HotelTest {





    @Test
    void test() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.features(0);
        String c = outContent.toString();
        assertEquals("Enter valid option",c);
    }
	 @Test
	    void test1() {

         final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
         System.setOut(new PrintStream(outContent));
         Hotel obj = new Hotel();
         obj.features(1);
         String c = outContent.toString();
         assertEquals("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000 ", c);

     }

     @Test
    void test2() {

            final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            Hotel obj = new Hotel();
            obj.features(2);
            String c = outContent.toString();
            assertEquals("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3000 ",c );

        }

        @Test
        void test3() {

            final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            Hotel obj = new Hotel();
            obj.features(3);
            String c = outContent.toString();
            assertEquals("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2200 ",c );

        }

        @Test
        void test4() {

            final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            Hotel obj = new Hotel();
            obj.features(4);
            String c = outContent.toString();
            assertEquals("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 " ,c);

        }


        @Test
        void test5() {

            final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            Hotel obj = new Hotel();
            obj.features(5);
            String c = outContent.toString();
            assertEquals("Enter valid option",c);

        }

        @Test
        void test6() {

            final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            Hotel obj = new Hotel();
            char n;
            obj.features('n');
            String c = outContent.toString();
            assertEquals("Enter valid option",c);

        }

        @Test
        void test7() {

            final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            Hotel obj = new Hotel();
            try{
                obj.features(Integer.parseInt("help me"));
                String c = outContent.toString();
                assertEquals("Enter valid option",c);
            }
            catch(Exception e){
                assertEquals("Enter valid",e.getMessage());
            }

        }

        @Test
        void test8() {

            final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            Hotel obj = new Hotel();
            obj.features('@');
            String c = outContent.toString();
            assertEquals("Enter valid option",c);
            }
    @Test
    void test9(){

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.features(-5);
        String c = outContent.toString();
        assertEquals("Enter valid option",c);
    }

        @Test
    void test10(){ //testcase for ordering food when room isn't booked
//
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.order(6, 3);
        String c = outContent.toString();
        assertEquals(true, c.contains("Room not booked"));
    }



    @Test
    void test12(){ //testcase for ordering food when room is isn't in list

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.order(0, 3);
        String c = outContent.toString();
        assertEquals(true, c.contains("Room doesn't exist"));
    }



    @Test
    void test14(){ //testcase for ordering food when room is isn't in list

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.order(-5, 2);
        String c = outContent.toString();
        assertEquals(true, c.contains("Room doesn't exist"));
    }

    @Test
    void test15(){ //testcase for ordering food when room is isn't in list

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.order('@', 2);
        String c = outContent.toString();
        assertEquals(true, c.contains("Room doesn't exist"));
    }

    @Test
    void test17(){ //testcase for ordering food when room is isn't in list

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.order(1, 0);
        String c = outContent.toString();
        assertEquals(true, c.contains("Invalid option"));
    }

    @Test
    void test18(){ //testcase for ordering food when room is isn't in list

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.order(1, 45);
        String c = outContent.toString();
        assertEquals(true, c.contains("Invalid option"));
    }


    @Test
    void test19(){ //testcase for ordering food when room is isn't in list

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.order(36, 3);
        String c = outContent.toString();
        assertEquals(true, c.contains("Cannot be done"));
    }



    //test case to check availability of certain room
    @Test
    void test20()
    {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.availability(1);
        String c = outContent.toString();
        assertEquals("Number of rooms available : 10", c);
    }
//
//    //test case to check availability of certain room
    @Test
    void test21()
    {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.availability(2);
        String c = outContent.toString();
        assertEquals("Number of rooms available : 20", c);
    }
//
//    //test case to check availability of certain room
    @Test
    void test22()
    {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.availability(3);
        String c = outContent.toString();
        assertEquals("Number of rooms available : 10", c);
    }
//
//    //test case to check availability of certain room
    @Test
    void test23()
    {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.availability(4);
        String c = outContent.toString();
        assertEquals("Number of rooms available : 20", c);
    }

    @Test
    void test24()
    {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.availability(5);
        String c = outContent.toString();
        assertEquals(true, c.contains("Enter valid option"));
    }

    @Test
    void test25()
    {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.availability(-5);
        String c = outContent.toString();
        assertEquals(true, c.contains("Enter valid option"));
    }

    @Test
    void test26()
    {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.availability(0);
        String c = outContent.toString();
        assertEquals(true, c.contains("Enter valid option"));
    }

    @Test
    void test27()
    {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.availability('c');
        String c = outContent.toString();
        assertEquals(true, c.contains("Enter valid option"));
    }

    @Test
    void test28()
    {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Hotel obj = new Hotel();
        obj.availability('@');
        String c = outContent.toString();
        assertEquals(true, c.contains("Enter valid option"));
    }





    @Test
        void test29() {

            final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            Hotel obj = new Hotel();
            try{
                obj.availability(Integer.parseInt("help me"));
                String c = outContent.toString();
                assertEquals("Enter valid option",c);
            }
            catch(Exception e){
                assertEquals("Enter valid",e.getMessage());
            }

        }







}
