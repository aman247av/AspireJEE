package com.jee00.aspirejee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class chemtopic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemtopic);
        Button basicconcept= (Button) findViewById(R.id.basicconcept);
        Button atomicstruct=findViewById(R.id.atomicstruct);
        Button periodictable=findViewById(R.id.periodictable);
        Button chembond=findViewById(R.id.chembond);
        Button gaseoustate=findViewById(R.id.gaseoustate);
        Button redoxrxn=findViewById(R.id.redoxrxn);
        Button surfaceChem=findViewById(R.id.surfaceChem);
        Button thermo=findViewById(R.id.thermo);
        Button equilibrium=findViewById(R.id.equilibrium);
        Button sblock=findViewById(R.id.sblock);
        Button basicOrganicChem=findViewById(R.id.basicOrganicChem);
        Button hydrocarbons=findViewById(R.id.hydrocarbons);
        Button solidStateSC=findViewById(R.id.solidStateSC);
        Button solutions=findViewById(R.id.solutions);
        Button electrochem=findViewById(R.id.electrochem);
        Button chemkinetic=findViewById(R.id.chemkinetic);
        Button isolationOfelements=findViewById(R.id.isolationOfelements);
        Button hydrogen=findViewById(R.id.hydrogen);
        Button pblock=findViewById(R.id.pblock);
        Button d_fblock=findViewById(R.id.d_fblock);
        Button CoordinationComp=findViewById(R.id.CoordinationComp);
        Button Halo=findViewById(R.id.Halo);
        Button alcohol=findViewById(R.id.alcohol);
        Button aldeh=findViewById(R.id.aldeh);
        Button nitro=findViewById(R.id.nitro);
        Button polymers=findViewById(R.id.polymers);
        Button bio=findViewById(R.id.bio);
        Button chemevery=findViewById(R.id.chemevery);
        Button practicalOrg=findViewById(R.id.practicalOrg);
        Button environchem=findViewById(R.id.environchem);

      /* basicconcept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        atomicstruct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        gaseoustate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        periodictable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        chembond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        redoxrxn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        surfaceChem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        thermo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        equilibrium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        sblock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        basicOrganicChem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        solidStateSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        hydrocarbons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        solutions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        electrochem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        chemkinetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        isolationOfelements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        hydrogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        pblock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        d_fblock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        CoordinationComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        Halo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        alcohol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        aldeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        nitro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        polymers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        chemevery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        environchem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });

        practicalOrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chemtopic.this, .class)
                startActivity(intent);
            }
        });


       */
    }
}