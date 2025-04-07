package vn.hieplq.repeatable.annotation.osgi.component;

import org.adempiere.base.AnnotationBasedColumnCalloutFactory;
import org.adempiere.base.IColumnCalloutFactory;
import org.osgi.service.component.annotations.Component;

import vn.hieplq.repeatable.annotation.callout.MultiOsgiCalloutAnnotation;

@Component(immediate = true, service = IColumnCalloutFactory.class, property = {"service.ranking:Integer=1"})
public class OsgiAnnotationColumnCalloutFactory extends AnnotationBasedColumnCalloutFactory{

	@Override
	protected String[] getPackages() {
		return new String[] { MultiOsgiCalloutAnnotation.class.getPackageName() };
	}

}
