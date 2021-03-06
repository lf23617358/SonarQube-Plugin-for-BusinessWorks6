/*
 * SonarQube Java
 * Copyright (C) 2012 SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package com.tibco.businessworks6.sonar.plugin;

import com.google.common.collect.ImmutableList;
//import com.tibco.sonar.plugins.bw.colorizers.BusinessWorksProcessColorizerFormat;
import com.tibco.businessworks6.sonar.plugin.metric.BusinessWorksMetrics;
import com.tibco.businessworks6.sonar.plugin.sensor.ProcessMetricSensor;
import com.tibco.businessworks6.sonar.plugin.widget.BusinessWorksMetricsWidget;

import java.util.List;

public final class CommonExtensions {

	private CommonExtensions() {
	}

	@SuppressWarnings("rawtypes")
	public static List getExtensions() {
		ImmutableList.Builder<Object> builder = ImmutableList.builder();
		builder.add(BusinessWorksMetrics.class);
		builder.add(BusinessWorksMetricsWidget.class);
		//builder.add(BusinessWorksProcessColorizerFormat.class);
		return builder.build();
	}

}
