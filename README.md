# How test plugin is created
vn.hieplq.repeatable.annotation.equinox is plugin base with equinox
![image](https://github.com/user-attachments/assets/a0a5f199-d763-4f8b-8437-de7cc06bd24b)

vn.hieplq.repeatable.annotation.osgi is plugin base with standard osgi
![image](https://github.com/user-attachments/assets/7f881940-7a8a-41ac-ad28-77d97ed9dff7)

# How to test
1. import both to idempiere workspace
2. add to server.product
3. place debug at line `AnnotationInfoList annotationInfos = classInfo.getAnnotationInfoRepeatable(Callout.class);` on class `AnnotationBasedColumnCalloutFactory.activate`
![image](https://github.com/user-attachments/assets/242724bb-8e48-4c82-bfd8-dd1aa5c26799)
4. evaluate bellow expresion to see how difference for each plugin
   1. classInfo.getAnnotationInfoRepeatable(Callout.class)
   2. classInfo.getAnnotationInfoRepeatable(Callouts.class)
   3. scanResult.getClassesWithAnnotation(Callout.class)
   4. scanResult.getClassesWithAnnotation(Callouts.class)

# This's my test result
1. DefaultAnnotationBasedColumnCalloutFactory for each expresion
   1. classInfo.getAnnotationInfoRepeatable(Callout.class) => List two items of AnnotationInfo
   2. classInfo.getAnnotationInfoRepeatable(Callouts.class) => Empty list
   3. scanResult.getClassesWithAnnotation(Callout.class) => list one item of ClassInfo (for class CalloutInfoWindow)
   4. scanResult.getClassesWithAnnotation(Callouts.class) => same above, list one item of ClassInfo (for class CalloutInfoWindow)
2. EquinoxAnnotationColumnCalloutFactory and OsgiAnnotationColumnCalloutFactory produce the same result, as shown below
   1. classInfo.getAnnotationInfoRepeatable(Callout.class) => Empty list
   2. classInfo.getAnnotationInfoRepeatable(Callouts.class) => List one item of AnnotationInfo (for class Callouts)
   3. scanResult.getClassesWithAnnotation(Callout.class) => Empty list
   4. scanResult.getClassesWithAnnotation(Callouts.class) => List two items of ClassInfo (for class Multi[Osgi/Equinox]CalloutAnnotation and [Osgi/Equinox]CalloutInfoWindow)
