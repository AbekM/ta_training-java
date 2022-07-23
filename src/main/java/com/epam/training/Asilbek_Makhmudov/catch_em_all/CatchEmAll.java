package com.epam.training.Asilbek_Makhmudov.catch_em_all;

import java.io.FileNotFoundException;
import java.io.IOException;


public class CatchEmAll {
    static Exception exception =  new FileNotFoundException("fnf");
    public static void riskyMethod() throws Exception{
        throw exception;
    }

    public static void main(String[] args) throws Exception{
        try{
            riskyMethod();
        }catch (FileNotFoundException fnf){
            throw new IllegalArgumentException("Resource is missing", fnf);
        }
        catch (IOException IO){
            throw new IllegalArgumentException("Resource error", IO);
        }catch (ArithmeticException ar){
            System.err.println("ar");
        }catch (NumberFormatException nfr){
            System.err.println("nfe");
        }
    }
}
