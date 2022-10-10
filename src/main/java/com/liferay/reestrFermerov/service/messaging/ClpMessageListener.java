package com.liferay.reestrFermerov.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.liferay.reestrFermerov.service.ClpSerializer;
import com.liferay.reestrFermerov.service.FermerLocalServiceUtil;
import com.liferay.reestrFermerov.service.FermerServiceUtil;
import com.liferay.reestrFermerov.service.RayonLocalServiceUtil;
import com.liferay.reestrFermerov.service.RayonServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            FermerLocalServiceUtil.clearService();

            FermerServiceUtil.clearService();
            RayonLocalServiceUtil.clearService();

            RayonServiceUtil.clearService();
        }
    }
}
