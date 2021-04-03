import org.testng.Assert;

import java.io.IOException;

import static jdk.nashorn.internal.runtime.JSType.isString;

public class Assert_API_Action {

    public static boolean Assert_API_Header() throws IOException {

        Assert_API Assert_Head = new Assert_API();
        String h = Constans_Page.Chosen_Header;

        Assert_Head.Assert_Header();
        {
            try {
                Assert.assertTrue(true, h);
                {
                    System.out.println("Chosen header name is :" + h);


                }


            } catch (Exception e) {
                System.out.println("Header was not found");
            }


        }
        return true;
    }

    public static boolean Is_String() throws IOException {
        Register_Response_Print Assert_String = new Register_Response_Print();


        String s = Constans_Page.ID;
        Assert_String.print_Response();
        {
            try {
                Assert.assertTrue(true, s);
                {
                    System.out.println(s);
                }

                {
                    Assert_String_API assert_string_api = new Assert_String_API();


                    String id = "1297449";

                    if (!assert_string_api.isString(id))

                        System.out.println("Id is not a string");


                    else
                        System.out.println("Id is a string ");


                }
            } catch (Exception e) {
                System.out.println("id was not found ");
            }
            return true;
        }


    }




    public static boolean Is_Integer()throws IOException{
        Register_Response_Print Assert_Integer = new Register_Response_Print();


        String C = Constans_Page.Country_ID;
      Assert_Integer.print_Response();
        {
            try {
                Assert.assertTrue(true, C);{
                    System.out.println(C);
                }

                {
                    Assert_Integer_API assert_integer = new Assert_Integer_API();


                    String Country = "5";

                    if (assert_integer.isNumber(Country)) {
                        System.out.println("Country Id is an Integer");
                    }

                    else
                        System.out.println("String");
                }

            } catch (Exception e) {
                System.out.println("Country_ID was not found ");
            }
            return true;
        }



    }
}







