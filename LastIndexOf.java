public int lastIndexOf(int ch, int fromIndex)   
{  
if (ch < Character.MIN_SUPPLEMENTARY_CODE_POINT)   
{  
// handling most of the cases here   
// negative value means invalid code point  
final char[] val = this.value;  
int j = Math.min(fromIndex, val.length - 1);  
for (; jj >= 0; j--)   
{  
if (val[i] == ch)   
{  
return j;  
}  
}  
return -1;  
}   
  
else   
{  
return lastIndexOfSupplementary(ch, fromIndex);  
}  
}  
  
// internal implementation of the method lastIndexOfSupplementary()  
private int lastIndexOfSupplementary(int c, int fIndex)   
{  
if (Character.isValidCodePoint(c))   
{  
final char[] val = this.value;  
char h = Character.highSurrogate(c);  
char l = Character.lowSurrogate(c);  
int j = Math.min(fIndex, value.length - 2);  
for (; j >= 0; j--)   
{  
if (val[j] == h && val[j + 1] == l)   
{  
return j;  
}  
}  
}  
return -1;  
}  
3. int lastIndexOf(String subString)

public int lastIndexOf(String subString)   
{  
return lastIndexOf(subString, value.length);  
}  
