package com.project.contactos.utils.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * This utility class for models class
 * 
 * @author vroman
 * 
 */
public class ModelUtils {
    private ModelUtils() {
    }

    /**
     * This method builds string thats represents information about object  
     * @param object
     * @return {@link String}
     */
    public static String buildToString(Object object) {
        return ToStringBuilder.reflectionToString(object,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
    
    /**
     * This method builds object hashcode  
     * @param object
     * @return int
     */
    public static int buildHashCode(Object object) {
        return HashCodeBuilder.reflectionHashCode(object);
    }

    /**
     * This method check if objects a equals  
     * @param obj1 first instance
     * @param obj2 second instance
     * @return boolean
     */
    public static boolean buidEquals(Object obj1,Object obj2) {
        return EqualsBuilder.reflectionEquals(obj1, obj2);
    }
}
