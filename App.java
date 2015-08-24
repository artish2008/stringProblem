package com.proj1.module1.com.proj2.module2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String str = "I am doing fine today";
        char c = 'i';
        String res=str.replaceAll("i", " ");
        System.out.println(res);
        System.out.println(remChar(str,c));
       
        }

    public static String remChar(String s, char c){
        
        StringBuilder str = new StringBuilder();
        char[] carr = s.toCharArray();
        for(int i=0; i<carr.length; i++)
        {
            if(carr[i] ==c)
            {

            } 
            else {
            	 str.append(carr[i]);
            }
        }
        return str.toString();
    }
        
    }

