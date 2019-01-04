package com.laser.changevalue;

import java.util.Date;

import com.laser.excelPOI.BaseChangeValue;
import com.laser.util.DateUtil;

public class ChangeValueDate extends BaseChangeValue {

	@Override
	public Object changevalue(Object obj) {
		if (obj == null) {
			return "";
		} else if (obj instanceof Date) {
			return DateUtil.format((Date) obj, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}

}
