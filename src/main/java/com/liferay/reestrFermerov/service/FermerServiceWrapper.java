package com.liferay.reestrFermerov.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FermerService}.
 *
 * @author liza
 * @see FermerService
 * @generated
 */
public class FermerServiceWrapper implements FermerService,
    ServiceWrapper<FermerService> {
    private FermerService _fermerService;

    public FermerServiceWrapper(FermerService fermerService) {
        _fermerService = fermerService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _fermerService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _fermerService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _fermerService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public FermerService getWrappedFermerService() {
        return _fermerService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedFermerService(FermerService fermerService) {
        _fermerService = fermerService;
    }

    @Override
    public FermerService getWrappedService() {
        return _fermerService;
    }

    @Override
    public void setWrappedService(FermerService fermerService) {
        _fermerService = fermerService;
    }
}
