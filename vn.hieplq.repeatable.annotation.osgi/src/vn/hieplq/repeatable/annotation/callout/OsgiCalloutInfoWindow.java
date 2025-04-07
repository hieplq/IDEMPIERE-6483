package vn.hieplq.repeatable.annotation.callout;

import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.adempiere.base.annotation.Callout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;

@Callout(tableName = "AD_InfoWindow", columnName = "AD_Table_ID")
@Callout(tableName = "AD_InfoColumn", columnName = {"AD_Element_ID","AD_Reference_ID"})
public class OsgiCalloutInfoWindow implements IColumnCallout{

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		return null;
	}

}
