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
e = enumeration

## Sample

com.voiture [[

	+ e Marque {
		Audi
		Renault
		Peugeot
		Volkswagen
	}

	+ Roue {
		~ taille : integer
		+ tourne(angle : integer) : boolean
	}

	+ Moteur {
		- puissance : integer
	}

	+ i Vehicule {
		+ avance()
	}

	+ a VehiculeMotorise : Vehicule {
		- marque : Marque
		- <!> moteur : Moteur
	}

	+ Voiture : VehiculeMotorise {
		- <> roues : Roue[4]
		- nbPorte : integer 
		
		+ avance() <- Vehicule:avance()
	}
	
]]
