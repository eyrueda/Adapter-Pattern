package com.company;

import com.company.adapters.SquarePegAdapter;
import com.company.round.RoundHole;
import com.company.round.RoundPeg;
import com.company.square.SquarePeg;

public class Main {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        if (hole.fits(peg)) {
            System.out.println("The peg p5 fits into the hole h5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter adapterSmallSqPeg = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter adapterLargeSqPeg = new SquarePegAdapter(largeSqPeg);
        if(hole.fits(adapterSmallSqPeg)){
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if(!hole.fits(adapterLargeSqPeg)){
            System.out.println("Square peg w20 does not fits round hole r5.");
        }

    }
}
