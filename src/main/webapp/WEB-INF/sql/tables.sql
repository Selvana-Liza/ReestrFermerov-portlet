create table RR_Fermer (
	fermerId LONG not null primary key,
	name VARCHAR(75) null,
	pravoForma VARCHAR(75) null,
	inn VARCHAR(75) null,
	kpp VARCHAR(75) null,
	ogrn VARCHAR(75) null,
	rayonRegistration VARCHAR(75) null,
	rayonPosevPole VARCHAR(75) null,
	dateRegistration DATE null,
	archiveStatus BOOLEAN
);

create table RR_Fermers_Rayons (
	fermerId LONG not null,
	rayonId LONG not null,
	primary key (fermerId, rayonId)
);

create table RR_Rayon (
	rayonId LONG not null primary key,
	name VARCHAR(75) null,
	kod INTEGER,
	archive BOOLEAN
);

create table RR_RayonsPP_Fermers (
	fermerId LONG not null,
	rayonId LONG not null,
	primary key (fermerId, rayonId)
);