package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.App;


public class AppTest {
  
  
    //Addition 


        @Test
        public void twoPlusTwoIsFour(){
            App app = new App();

            int result = app.add(2, 2);

            assertEquals(4, result);

        }
        @Test
        public void twoPlusNegativeOneIsOne(){
            App app = new App();

            int result = app.add(2, -1); //this also works when one value is a negative number

            assertEquals(1, result);

        }

        @Test
        public void negativeFourPlusNegativeNineIsNegativeThirteen(){
            App app = new App();

            int result = app.add(-4, -9); //this also works when both are negative numbers

            assertEquals(-13, result);

        }



        @Test
        public void plusBigNumbers(){
            App app = new App();

            int result = app.add(21317, 27511);

            //assertEquals(48821, result);               //this is expected to provide error if your inputed expected value is wrong

            assertEquals(48828, result);

        }


    //Subraction


        @Test

        public void twoMinusTwoIsZero(){
            App app = new App();

            int result = app.substract(2, 2);

            assertEquals(0, result);

        }

        public void twoMinusThreeIsNegativeOne(){
            App app = new App();

            int result = app.substract(2, 3); // this also works if the answer is a negatve value

            assertEquals( -1, result);

        }

    
        @Test
        public void twoMinusNegativeOneIsPositiveThree(){
            App app = new App();

            int result = app.substract(2, -1); //this also works when one value is a negative number

            assertEquals(3, result);

        }

        public void negativeOneMinusTwoIsPositiveThree(){
            App app = new App();

            int result = app.substract(-1, 2); //the output changes based on if the negative value is the minuend or subtrahend

            assertEquals(-3, result);

        }

        @Test
        public void negativeFourMinusNegativeNineIsPositiveFive(){
            App app = new App();

            int result = app.substract(-4, -9); //this also works when both are negative numbers

            assertEquals(5, result);

        }



        @Test
        public void minusBigNumbers(){
            App app = new App();

            int result = app.substract(21317, 2322);

            //assertEquals(17995, result);               //this is expected to provide error if your inputed expected value is wrong

            assertEquals(18995, result);

        }

    //Multiplication


        @Test
        public void twoTimesThreeIsSix(){
            App app = new App();

            int result = app.multiply(2, 3);

            assertEquals(6, result);

        }

        
        @Test
        public void twoTimesNegativeFiveIsNegativeTen(){
            App app = new App();

            int result = app.multiply(2, -5); //this also works when one value is a negative number where the result is a negative number

            assertEquals(-10, result);

        }

        

        @Test
        public void negativeFourtimesNegativeNineIsPositiveThirtySix(){
            App app = new App();

            int result = app.multiply(-4, -9); //this also works when both are negative numbers where the result is a positive number

            assertEquals(36, result);

        }



        @Test
        public void multiplyBigNumbers(){
            App app = new App();

            int result = app.multiply(25217, 2322);

            //assertEquals(58553884, result);               //this is expected to provide error if your inputed expected value is wrong

            assertEquals(58553874, result);

        }
    
    //Division

        @Test
        public void tenDividebyTwo(){
            App app = new App();

            double result = app.divide(10, 2);

            assertEquals(5, result,0.001);

        }



        @Test
        public void twoDividebyThree(){
            App app = new App();

            double result = app.divide(2, 3);

            assertEquals(0.666, result,0.001);

        }

        
        @Test
        public void threeDividebyNegativeSix(){
            App app = new App();

            double result = app.divide(3, -6); //this also works when one value is a negative number where the result is a negative number

            assertEquals(-0.5, result,0.001);

        }
        public void negativeSixDividebyThree(){
            App app = new App();

            double result = app.divide(-6, 3); //this also works when one value is a negative number where the result is a negative number

            assertEquals(-2, result,0.001);

        }
        @Test
        public void negativeFourDividebyNegativeNine(){
            App app = new App();

            double result = app.divide(-4, -9); //this also works when both are negative numbers where the result is a positive number

            assertEquals(0.444, result,0.001);

        }



        @Test
        public void divideBigNumbers(){
            App app = new App();

            double result = app.divide(9816, 4731);

            //assertEquals(2.070, result);               //this is expected to provide error if your inputed expected value is wrong

            assertEquals(2.074, result,0.001);

        }

    
}
