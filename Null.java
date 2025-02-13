public class NullExample3 {  
      
String str;  
    public static void main(String[] args) {  
        NullExample3 obj=new NullExample3();  
        System.out.println(obj.str);  
    }  
      
}  
</pre></div>  
<p><strong>Output:</strong></p>  
<div class="codeblock3"><pre>  
null  
</pre></div>  
<h2 class="h3">Example 4</h2>  
<p>Let's see an example to return null from a method.</p>  
<div class="codeblock"><textarea name="code" class="java">  
public class NullExample4 {  
    String display()  
    {  
        return null;  
    }  
    public static void main(String[] args) {  
    NullExample4 obj=new NullExample4();  
        System.out.println(obj.display());  
    }  
}  
