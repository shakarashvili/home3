import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class second {
    @Test
    public void openchrome(){
//        open ( "https://amindi.ge/ka/");
//     $ (byText("ყველა ვალუტა")).click();
//        closeWebDriver();
        // სამწუხაროა რომ ერთი საიტიდან მეორეზე ვერ გადმოვედი ,
        //უფრო სწორად amindi.ge_დან გადავედი ბიპიენზე მაგრამ შემდეგ ინსპექტ ელემენტები რომ მომაქვს, ბიპიენიდან კი აღარ მოაქვს
        // მოაქვს amindi.ge დან ანუ amindi.ge_ზე მაბრუნებს ამის გამო შევინახე მაინც ეს კოდი,იქნებ გავერკვე .
       open("https://www.bpn.ge/");
       $ (byAttribute("class ", "sign-in")).click();
       $ (byName("email")).click();
       $ (byName("email")).setValue("shaqarashvili25@gmail.com");
       $ (byName("password")).click();
       $ (byName("password")).setValue("123123123");
       $ (byName("password_repeat")).click();
        $(byName("password_repeat")).setValue("123123123");
        $ (by("title", "რეგისტრაცია")).click();
        $ (byXpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/span/form/button")).pressEnter().click();
       $(byXpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/form/div[1]/span/input")).click();
        $(byXpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/form/div[1]/span/input")).
                setValue("shaqarashvili25@gmail.com");
        $(byXpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/form/div[2]/span/input")).click();
        $(byXpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/form/div[2]/span/input")).setValue("123123123");
        $(byXpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/form/button")).click();
//        $ (byClassName("auth__plugin"),1 ).click();
//        $ (byClassName("auth__plugin"),1 ).click();
        $ (by("title", "დაგავიწყდა პაროლი?")).click();
        $(by("rules","required|email")).click();
        $(by("rules","required|email")).setValue("shaqarashvili25@gmail.com").pressEnter();
        $(by("title","გაგზავნა"),1).pressEscape().click();
        sleep(30000);
    }
}
