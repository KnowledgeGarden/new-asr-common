SET ROLE tq_admin;

CREATE SEQUENCE IF NOT EXISTS public.topic_id_seq
    AS bigint
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


CREATE TABLE IF NOT EXISTS public.triple (
	id 		BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('public.topic_id_seq'::regclass),
	subj_id	BIGINT NOT NULL,
	pred_id	BIGINT NOT NULL,
	obj_id	BIGINT NOT NULL,
	subj_typ 	TEXT NOT NULL,
	obj_typ		TEXT NOT NULL
);

CREATE INDEX IF NOT EXISTS triple_idx ON public.triple (id, subj_id, obj_id, subj_typ, obj_typ);

CREATE TABLE IF NOT EXiSTS public.sentenceids  (
	id 			BIGINT PRIMARY KEY NOT NULL REFERENCES  public.triple (id),
	sentence_id	BIGINT NOT NULL
);