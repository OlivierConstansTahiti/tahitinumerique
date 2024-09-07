import {AutitableResponse} from "./audit.model";
import {OffsetUTC} from "./offsetUTC.model";

export interface TimezoneResponse extends AutitableResponse {
  id: number;
  label: string;
  offsetUTC: OffsetUTC;
}

export interface TimezoneRequest {
  label: string;
  offsetUTC: OffsetUTC;
}
