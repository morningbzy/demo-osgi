package org.morningbzy.demo;

import org.morningbzy.demo.interfaces.IAuth;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {
    public void start(BundleContext bundleContext) throws Exception {
        ServiceReference ref = bundleContext.getServiceReference(IAuth.class.getName());
        IAuth service = (IAuth) bundleContext.getService(ref);
        System.out.println(service.init(100));
    }

    public void stop(BundleContext bundleContext) throws Exception {

    }
}
