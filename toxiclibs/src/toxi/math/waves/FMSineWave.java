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
package toxi.math.waves;

public class FMSineWave extends AbstractWave {

	private AbstractWave fmod;
	/**
	 * 
	 */
	public FMSineWave(float theta, float freq, AbstractWave fmod) {
		super(theta,freq);
		this.fmod = fmod;
	}
	
	public FMSineWave(float theta, float freq, float amp, float offset, AbstractWave fmod) {
		super(theta,freq,amp,offset);
		this.fmod = fmod;
	}
	
	/* (non-Javadoc)
	 * @see toxi.math.datatypes.AbstractWave#update()
	 */
	@Override
	public float update() {
		value = (float)(Math.sin(theta*fmod.update()) * amp) + offset;
		theta+=freq;
		return value;
	}

}