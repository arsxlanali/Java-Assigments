/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arsla
 */
public class UnknownOperatorException extends Exception
{
    public UnknownOperatorException(String operator)
    {
        super(operator);
        System.out.println(operator+ " operator is unknow " );
    }
    
}
