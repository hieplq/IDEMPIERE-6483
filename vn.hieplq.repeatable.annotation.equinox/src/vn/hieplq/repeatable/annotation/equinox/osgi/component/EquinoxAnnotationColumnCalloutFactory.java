package vn.hieplq.repeatable.annotation.equinox.osgi.component;

import org.adempiere.base.AnnotationBasedColumnCalloutFactory;
import org.adempiere.base.IColumnCalloutFactory;
import org.osgi.service.component.annotations.Component;

import vn.hieplq.repeatable.annotation.equinox.callout.MultiEquinoxCalloutAnnotation;

@Component(immediate = true, service = IColumnCalloutFactory.class, property = {"service.ranking:Integer=1"})
public class EquinoxAnnotationColumnCalloutFactory extends AnnotationBasedColumnCalloutFactory{
	@Override
	protected String[] getPackages() {
		return new String[] { MultiEquinoxCalloutAnnotation.class.getPackageName() };
	}
}
