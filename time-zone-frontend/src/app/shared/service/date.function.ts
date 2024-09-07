import moment from "moment";

export function toDate(value: string): Date {
  return moment(value).toDate()
}

export function toUTCDate(value: string): Date {
  return transformToUTCDate(toDate(value))
}

export function transformToUTCDate(value: Date): Date {
  return new Date(Date.UTC(
    value.getFullYear(),
    value.getMonth(),
    value.getDate(),
    value.getHours(),
    value.getMinutes(),
    value.getSeconds(), 0))
}
