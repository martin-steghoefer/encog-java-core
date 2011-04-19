/*
 * Encog(tm) Core v3.0 - Java Version
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 
 * Copyright 2008-2011 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.mathutil.rbf;

import org.encog.neural.flat.rbf.RadialBasisFunction;

/**
 * Basic radial basis function. Defines centers for each of the RBF's. All RBF's
 * have a common radius and peak.
 * 
 */
public abstract class BasicRBF implements RadialBasisFunction {

	/**
	 * Serial id.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The center of the RBF.
	 */
	private double[] center;

	/**
	 * The peak of the RBF.
	 */
	private double peak;

	/**
	 * The width of the RBF.
	 */
	private double width;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final double getCenter(final int dimension) {
		return this.center[dimension];
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final double[] getCenters() {
		return this.center;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final int getDimensions() {
		return this.center.length;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final double getPeak() {
		return this.peak;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final double getWidth() {
		return this.width;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final void setCenters(final double[] centers) {
		this.center = centers;

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final void setPeak(final double thePeak) {
		this.peak = thePeak;

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final void setWidth(final double theWidth) {
		this.width = theWidth;
	}
}