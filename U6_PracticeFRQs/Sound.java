package U6_PracticeFRQs;

public class Sound {

    /* the array of values in this sound; guaranteed not to be null */
    private int[] samples;
  
    /* constructor not shown */
 
    /* Changes those values in this sound that have an amplitude
     * greater than limit. Values greater than limit are changed to
     * limit. Values less than -limit are changed to -limit.
     * The method returns the total number of values that were changed
     * in the array.
     *
     * PRECONDITION: limit ≥ 0
     */
     public int limitAmplitude(int limit) {
        int count = 0;
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] > limit || samples[i] < -1 * limit) {
                count++;
                if (samples[i] > limit) {
                    samples[i] = limit;
                } else {
                    samples[i] = -1 * limit;
                }
            }
        }
        return count;
     }
  
    /* Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0.
     *
     * PRECONDITION: samples contains at least one nonzero value
     *
     * POSTCONDITION: the length of samples reflects the removal
     *                of starting silence
     */
     public void trimSilenceFromBeginning() {
        int notSilentIdx = 0;
        int partsSilent = 0;
        while (samples[notSilentIdx] == 0) {
            partsSilent++;
            notSilentIdx++;
        }
        int[] newSample = new int[samples.length - partsSilent];
        int newSampleIdx = 0;
        for (int i = notSilentIdx; i < samples.length; i++) {
            newSample[newSampleIdx] = samples[i];
            newSampleIdx++;
        }
        samples = new int[newSample.length];
        for (int i = 0; i < newSample.length; i++) {
            samples[i] = newSample[i];
        }
     }
     
     public Sound(int[] samples) {
        this.samples = samples;
    }
    
    public int[] getSamples() {
        return samples;
    }    
 }
 