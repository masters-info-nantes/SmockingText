# SmokingText

## Notation

- = private 
+ = public
~ = protected
# = package

<> = aggrégation
<!> = composition

a = abstract
i = interface


## Sample

+ Roue {
	~ integer taille 
}

+ Moteur {
	- integer puissance
}

+ i Vehicule {}

+ a VehiculeMotorise : Vehicule {
	- <!> Moteur moteur
}

+ Vehicule : VehiculeMotorise {
	- <> Roue[4] roues
	- integer nbPorte
}

