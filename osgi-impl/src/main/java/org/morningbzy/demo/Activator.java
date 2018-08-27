package org.morningbzy.demo;

import org.morningbzy.demo.impl.Auth;
import org.morningbzy.demo.interfaces.IAuth;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import java.util.Dictionary;
import java.util.Hashtable;

public class Activator implements BundleActivator {
    public void start(BundleContext bundleContext) throws Exception {
        Dictionary<String, String> props = new Hashtable<String, String>();
        props.put("ModuleName", "Auth");
        bundleContext.registerService(IAuth.class.getName(), new Auth(), props);
        System.out.println("Starting Impl of Auth");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Stop Impl of Auth");
    }
}
