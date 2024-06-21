package Strings;

public class InterningAndNewKeyword {
    /*
    Interning is basically Done to save space in the memory
    In memory there are two parts Stacks and Heaps
    In Heap actual string is saved
    In Stack the address of the String is saved
    String str = "Hello";
    String gtr = "Hello"
    yaha par Dono strings me Hello hi saved hai . Is case me sbse pehle Heap me "Hello" str save ho jayega
    uska address jakar Stack me save ho jayega
    Jab humne gtr string banaya to ye sbse pehle memory me dekhega ki kya "Hello" string kahi memory me already to available nahi hai na ..aur agar hai to wo JIS string me hello save hai usi ka address stack me jakar save kardega aur str waale "Hello" ko hi point karega
    This is called INTERN POOL
    Just like arrays
    int arr ={1,2,3} Array to same hi hai bas name change ho gaya hai
    int brr ={1,2,3} String aur Arrays me bas ek difference hai ki Arrays me arr aur brr me se kisi me bhi changes karenge to wo doosre waale array me automatically reflect honge
    But Strings me esa nahi hota hai
     */
    /*
    If we have to utilise extra space fo the string gtr then we will do so by using "New Keyword"
    String x = new String("Hello");
    yaha par Heap me ek aur Hello banega ek naye address par because of the keyword "new"
    New helps us to avoid Interning
    */
}
