package vn.hieplq.repeatable.annotation.equinox.callout;

import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.adempiere.base.annotation.Callout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.I_A_Asset;
import org.compiere.model.I_A_Asset_Acct;

@Callout(tableName = I_A_Asset.Table_Name, columnName = I_A_Asset.COLUMNNAME_A_Asset_Status)
@Callout(tableName = I_A_Asset_Acct.Table_Name, columnName = I_A_Asset_Acct.COLUMNNAME_A_Asset_ID)
public class MultiEquinoxCalloutAnnotation implements IColumnCallout{

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		return null;
	}

}
