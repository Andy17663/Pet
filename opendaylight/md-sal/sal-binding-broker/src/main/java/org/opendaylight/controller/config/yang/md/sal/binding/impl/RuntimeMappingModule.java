/**
 * Generated file

 * Generated from: yang module name: opendaylight-sal-binding-broker-impl  yang module local name: runtime-generated-mapping
 * Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
 * Generated at: Wed Nov 20 18:20:19 CET 2013
 *
 * Do not modify this file unless it is present under src/main directory
 */
package org.opendaylight.controller.config.yang.md.sal.binding.impl;

import javassist.ClassPool;

import org.opendaylight.controller.sal.binding.codegen.impl.SingletonHolder;
import org.opendaylight.controller.sal.binding.dom.serializer.impl.RuntimeGeneratedMappingServiceImpl;
import org.osgi.framework.BundleContext;

import com.google.common.base.Preconditions;

/**
*
*/
public final class RuntimeMappingModule extends
        org.opendaylight.controller.config.yang.md.sal.binding.impl.AbstractRuntimeMappingModule {

    private BundleContext bundleContext;

    public RuntimeMappingModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,
            org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public RuntimeMappingModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,
            org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,
            RuntimeMappingModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void validate() {
        super.validate();
        Preconditions.checkNotNull(bundleContext);
        // Add custom validation for module attributes here.
    }

    @Override
    public boolean canReuseInstance(AbstractRuntimeMappingModule oldModule) {
        return true;
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        RuntimeGeneratedMappingServiceImpl service = new RuntimeGeneratedMappingServiceImpl();
        service.setPool(SingletonHolder.CLASS_POOL);
        service.start(getBundleContext());
        return service;
    }

    private BundleContext getBundleContext() {
        return bundleContext;
    }

    public void setBundleContext(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
    }
}
