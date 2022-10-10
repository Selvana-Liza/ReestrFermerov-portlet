create index IX_881022D8 on RR_Fermer (archiveStatus);
create index IX_871C1E67 on RR_Fermer (dateRegistration);
create index IX_B175C302 on RR_Fermer (fermerId);
create index IX_14A004AD on RR_Fermer (inn);
create index IX_8732056B on RR_Fermer (name);
create index IX_917D95E6 on RR_Fermer (rayonRegistration);

create index IX_1519B78 on RR_Fermers_Rayons (fermerId);
create index IX_1C71E852 on RR_Fermers_Rayons (rayonId);

create index IX_F2F06382 on RR_Rayon (archive);
create index IX_2D4CCDAF on RR_Rayon (name);
create index IX_7D74C8C4 on RR_Rayon (rayonId);

create index IX_4CCC4CF2 on RR_RayonsPP_Fermers (fermerId);
create index IX_927E1F98 on RR_RayonsPP_Fermers (rayonId);