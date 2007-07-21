/* 
 * Copyright (c) 2006, 2007 Karsten Schmidt
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * http://creativecommons.org/licenses/LGPL/2.1/
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package toxi.math;

/**
 * Implementation of the cosine interpolation function:
 * 
 * i = a+(b-a)*(1-0.5*cos(f*PI))
 *
 * @author toxi
 *
 */
public class CosineInterpolation implements InterpolateStrategy {

	/* (non-Javadoc)
	 * @see toxi.math.InterpolateStrategy#interpolate(float, float, float)
	 */
	public final float interpolate(float a, float b, float f) {
		return a+(b-a)*(float)(1-0.5*Math.cos(f*FastMath.PI));
	}

}
