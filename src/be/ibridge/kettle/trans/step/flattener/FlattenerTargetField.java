package be.ibridge.kettle.trans.step.flattener;

import be.ibridge.kettle.core.value.Value;

public class FlattenerTargetField
{
    private String  fieldName;
    private String  keyValue;
    private String  targetName;
    private int     targetType;
    private int     targetLength;
    private int     targetPrecision;
    private String  targetCurrencySymbol;
    private String  targetDecimalSymbol;
    private String  targetGroupingSymbol;
    private String  targetNullString;
    private String  targetFormat;
    private int     targetAggregationType;
    
    public static final int TYPE_AGGR_NONE           = 0;
    public static final int TYPE_AGGR_SUM            = 1;
    public static final int TYPE_AGGR_AVERAGE        = 2;
    public static final int TYPE_AGGR_MIN            = 3;
    public static final int TYPE_AGGR_MAX            = 4;
    public static final int TYPE_AGGR_COUNT_ALL      = 5;
    public static final int TYPE_AGGR_CONCAT_COMMA   = 6;

    public static final String typeAggrDesc[] = 
        {
            "-", Messages.getString("FlattenerTargetField.TypeAggrDesc.SUM"), Messages.getString("FlattenerTargetField.TypeAggrDesc.AVERAGE"), Messages.getString("FlattenerTargetField.TypeAggrDesc.MIN"), Messages.getString("FlattenerTargetField.TypeAggrDesc.MAX"), Messages.getString("FlattenerTargetField.TypeAggrDesc.COUNT_ALL"), Messages.getString("FlattenerTargetField.TypeAggrDesc.CONCAT_COMMA")     //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$
        };

    public static final String typeAggrLongDesc[] = 
        {
            "-", Messages.getString("FlattenerTargetField.TypeAggrLongDesc.SUM"), Messages.getString("FlattenerTargetField.TypeAggrLongDesc.AVERAGE"), Messages.getString("FlattenerTargetField.TypeAggrLongDesc.MIN"), Messages.getString("FlattenerTargetField.TypeAggrLongDesc.MAX"), Messages.getString("FlattenerTargetField.TypeAggrLongDesc.COUNT_ALL"), Messages.getString("FlattenerTargetField.TypeAggrLongDesc.CONCAT_COMMA")    //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$
        };


    /**
     * @return Returns the fieldName.
     */
    public String getFieldName()
    {
        return fieldName;
    }

    /**
     * @param fieldName The fieldName to set.
     */
    public void setFieldName(String fieldName)
    {
        this.fieldName = fieldName;
    }

    /**
     * @return Returns the targetFormat.
     */
    public String getTargetFormat()
    {
        return targetFormat;
    }

    /**
     * @param targetFormat The targetFormat to set.
     */
    public void setTargetFormat(String targetFormat)
    {
        this.targetFormat = targetFormat;
    }

    /**
     * Create an empty pivot target field
     */
    public FlattenerTargetField()
    {
    }

    /**
     * @return Returns the keyValue.
     */
    public String getKeyValue()
    {
        return keyValue;
    }
    /**
     * @param keyValue The keyValue to set.
     */
    public void setKeyValue(String keyValue)
    {
        this.keyValue = keyValue;
    }
    /**
     * @return Returns the targetCurrencySymbol.
     */
    public String getTargetCurrencySymbol()
    {
        return targetCurrencySymbol;
    }
    /**
     * @param targetCurrencySymbol The targetCurrencySymbol to set.
     */
    public void setTargetCurrencySymbol(String targetCurrencySymbol)
    {
        this.targetCurrencySymbol = targetCurrencySymbol;
    }
    /**
     * @return Returns the targetDecimalSymbol.
     */
    public String getTargetDecimalSymbol()
    {
        return targetDecimalSymbol;
    }
    /**
     * @param targetDecimalSymbol The targetDecimalSymbol to set.
     */
    public void setTargetDecimalSymbol(String targetDecimalSymbol)
    {
        this.targetDecimalSymbol = targetDecimalSymbol;
    }
    /**
     * @return Returns the targetGroupingSymbol.
     */
    public String getTargetGroupingSymbol()
    {
        return targetGroupingSymbol;
    }
    /**
     * @param targetGroupingSymbol The targetGroupingSymbol to set.
     */
    public void setTargetGroupingSymbol(String targetGroupingSymbol)
    {
        this.targetGroupingSymbol = targetGroupingSymbol;
    }
    /**
     * @return Returns the targetLength.
     */
    public int getTargetLength()
    {
        return targetLength;
    }
    /**
     * @param targetLength The targetLength to set.
     */
    public void setTargetLength(int targetLength)
    {
        this.targetLength = targetLength;
    }
    /**
     * @return Returns the targetName.
     */
    public String getTargetName()
    {
        return targetName;
    }
    /**
     * @param targetName The targetName to set.
     */
    public void setTargetName(String targetName)
    {
        this.targetName = targetName;
    }
    /**
     * @return Returns the targetNullString.
     */
    public String getTargetNullString()
    {
        return targetNullString;
    }
    /**
     * @param targetNullString The targetNullString to set.
     */
    public void setTargetNullString(String targetNullString)
    {
        this.targetNullString = targetNullString;
    }
    /**
     * @return Returns the targetPrecision.
     */
    public int getTargetPrecision()
    {
        return targetPrecision;
    }
    /**
     * @param targetPrecision The targetPrecision to set.
     */
    public void setTargetPrecision(int targetPrecision)
    {
        this.targetPrecision = targetPrecision;
    }
    /**
     * @return Returns the targetType.
     */
    public int getTargetType()
    {
        return targetType;
    }
    /**
     * @param targetType The targetType to set.
     */
    public void setTargetType(int targetType)
    {
        this.targetType = targetType;
    }
 
    /**
     * @return The description of the target Value type
     */
    public String getTargetTypeDesc()
    {
        return Value.getTypeDesc(targetType);
    }
    
    /**
     * Set the target type
     * @param typeDesc the target value type description
     */
    public void setTargetType(String typeDesc)
    {
        targetType=Value.getType(typeDesc);
    }
    

    /**
     * @return The target aggregation type: when a key-value collision occurs, what it the aggregation to use.
     */
    public int getTargetAggregationType()
    {
        return targetAggregationType;
    }

    /**
     * @param targetAggregationType Specify the The aggregation type: when a key-value collision occurs, what it the aggregation to use.
     */
    public void setTargetAggregationType(int targetAggregationType)
    {
        this.targetAggregationType = targetAggregationType;
    }
    
    
    
    
    public static final int getAggregationType(String desc)
    {
        for (int i=0;i<typeAggrDesc.length;i++)
        {
            if (typeAggrDesc[i].equalsIgnoreCase(desc)) return i;
        }
        for (int i=0;i<typeAggrLongDesc.length;i++)
        {
            if (typeAggrLongDesc[i].equalsIgnoreCase(desc)) return i;
        }
        return 0;
    }

    public static final String getAggregationTypeDesc(int i)
    {
        if (i<0 || i>=typeAggrDesc.length) return null;
        return typeAggrDesc[i];
    }

    public static final String getAggregationTypeDescLong(int i)
    {
        if (i<0 || i>=typeAggrLongDesc.length) return null;
        return typeAggrLongDesc[i];
    }

    public void setTargetAggregationType(String aggregationType)
    {
        targetAggregationType = getAggregationType(aggregationType);
    }

    public String getTargetAggregationTypeDesc()
    {
        return getAggregationTypeDesc(targetAggregationType);
    }

    public String getTargetAggregationTypeDescLong()
    {
        return getAggregationTypeDescLong(targetAggregationType);
    }

}
