/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchepannou.util.converter;
import com.tchepannou.util.StringUtil;
import java.util.Date;



/**
 *
 * @author herve
 */
public class ByteConverter 
        implements Converter
{
    //-- Converter override
    @Override
    public Object convert (Object value)
    {
        if (value instanceof Number)
        {
            return ((Number)value).byteValue();
        }
        else if (value instanceof String)
        {
            return StringUtil.toByte ((String)value, (byte)0);
        }
        else if (value instanceof Date)
        {
            return (byte)((Date)value).getTime ();
        }
        else if (value != null && value.getClass ().isArray ())
        {
            Object v = ((Object [])value)[0];
            return convert (v);
        }
        else
        {
            return 0;
        }
    }
}
